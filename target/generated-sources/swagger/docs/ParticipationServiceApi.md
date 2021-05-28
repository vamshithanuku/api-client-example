# ParticipationServiceApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addParticipant**](ParticipationServiceApi.md#addParticipant) | **POST** /v1/raffle-tool/participation/ | Post participant info
[**getParticipant**](ParticipationServiceApi.md#getParticipant) | **GET** /v1/raffle-tool/participation/email/{email} | Get participant details for given user email

<a name="addParticipant"></a>
# **addParticipant**
> Participant addParticipant()

Post participant info

API for post participant info

### Example
```java
// Import classes:
//import api.client.example.participation.invoker.ApiException;
//import api.client.example.participation.api.ParticipationServiceApi;


ParticipationServiceApi apiInstance = new ParticipationServiceApi();
try {
    Participant result = apiInstance.addParticipant();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParticipationServiceApi#addParticipant");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Participant**](Participant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParticipant"></a>
# **getParticipant**
> ParticipantGet getParticipant(email)

Get participant details for given user email

API for get participant for given user email

### Example
```java
// Import classes:
//import api.client.example.participation.invoker.ApiException;
//import api.client.example.participation.api.ParticipationServiceApi;


ParticipationServiceApi apiInstance = new ParticipationServiceApi();
String email = "email_example"; // String | path variable
try {
    ParticipantGet result = apiInstance.getParticipant(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParticipationServiceApi#getParticipant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| path variable |

### Return type

[**ParticipantGet**](ParticipantGet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

