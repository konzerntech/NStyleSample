<!DOCTYPE html>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>

<body ng-app="myApp" ng-controller="myCtrl">
<button ng-click="getdata();"> Click </button>
<h2>NSTYLE APPOINMENT DETAILS</h2>

<table style="width:100%" ng-if="records.length > 0">
  <tr>
    <th>Client Name</th>
    <th>Date</th> 
    <th>Shop</th>
     <th>Service Name</th>
      <th>Mobile Nuber</th>
  </tr>
  
  
  <tr ng-repeat="record in records" >
    <td>{{record.clientName}}</td>
    <td>{{record.appointmentDate}}</td>
    <td>{{record.shopName}}</td>
    <td>{{record.serviceName}}</td>
    <td>{{record.mobileNumber}}</td>
  </tr>


</table>



<script>
var app = angular.module("myApp", []);
app.controller("myCtrl", function($scope, $http) {
  $scope.records = [];
  $scope.getdata=function(){
	  
	    $http({
	        method : "POST",
	        url : "http://localhost:8080/NStyleSample/ApplicationServlets"
	    }).then(function mySuccess(response) {
	    	$scope.records = response.data;
	    }, function myError(response) {
	      //  $scope.myWelcome = response.statusText;
	    });
	  
  }
  
});
</script>

</body>
</html>
