import requests
import json

def test_locations():
	flag = True
	print("Test 1: Location")
	App_URL="http://uniadvisor.com:8080/api/location"
	print("ULR: " + App_URL)
	response = requests.get(App_URL)
	print("Response code: "+ str(response.status_code))
	if(response.status_code != 200): flag=False
	print(response.text)
	json_response = json.loads(response.text)
	location = json_response["location"]
	if location["shortName"] != "diag": flag = False
	return flag

def test_locations2():
        flag = True
        print("Test 2: Location + Param")
        App_URL="http://uniadvisor.com:8080/api/location?name=mirafiori"
        print("ULR: " + App_URL)
        response = requests.get(App_URL)
        print("Response code: "+ str(response.status_code))
        if(response.status_code != 200): flag=False
        print(response.text)
        json_response = json.loads(response.text)
        location = json_response["location"]
        if location["shortName"] != "mirafiori": flag = False
        return flag

def test_locations3():
	flag = True
	print("Test 3: Three closest + Param")
	App_URL = "http://uniadvisor.com:8080/api/threeclosest?lat=41.909547&lng=12.521329"
	print("URL: " + App_URL)
	response = requests.get(App_URL)
	print("Response code: " + str(response.status_code))
	print(response.text)
	if(response.status_code != 200): flag=False

	json_response = json.loads(response.text)
	location1 = json_response[0]
	location2 = json_response[1]
	location3 = json_response[2]
	if location1["shortName"] != "pratone": flag = False
	if location2["shortName"] != "mirafiori": flag = False
	if location3["shortName"] != "geologia": flag = False
	return flag



print("Passed: " + str(test_locations()))
print()
print("Passed: " + str(test_locations2()))
print()
print("Passed: " + str(test_locations3()))
