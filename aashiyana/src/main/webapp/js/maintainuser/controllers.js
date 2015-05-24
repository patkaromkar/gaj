'use strict';

/* Controllers */

var app = angular.module('ngdemo.controllers', []);


// Clear browser cache (in development mode)
//
// http://stackoverflow.com/questions/14718826/angularjs-disable-partial-caching-on-dev-machine
app.run(function ($rootScope, $templateCache) {
    $rootScope.$on('$viewContentLoaded', function () {
        $templateCache.removeAll();
    });
});


app.controller('DummyCtrl', ['$scope', 'DummyFactory', function ($scope, DummyFactory) {
    $scope.bla = 'bla from controller';
    DummyFactory.get({}, function (dummyFactory) {
        $scope.firstname = dummyFactory.firstName;
    })
}]);

app.controller('UserListCtrl', ['$scope', 'UsersFactory', 'UserFactory', '$location',
    function ($scope, UsersFactory, UserFactory, $location) {

        // callback for ng-click 'editUser':
        $scope.editUser = function (userId) {
            $location.path('/updateUser/' + userId);
        };

        // callback for ng-click 'deleteUser':
        $scope.deleteUser = function (userId) {
            UserFactory.deleteUser({ id: userId });
            $scope.users = UsersFactory.query();
        };

        // callback for ng-click 'createUser':
        $scope.createNewUser = function () {
            $location.path('/user-creation');
        };

        $scope.users = UsersFactory.query();
    }]);

app.controller('UserDetailCtrl', ['$scope', '$routeParams', 'UserFactory', '$location',
    function ($scope, $routeParams, UserFactory, $location) {
	
	var successPostCallback = function (e) {
        
    };
    
    var errorCallback = function (e) {
        alert(e)
    };

        // callback for ng-click 'updateUser':
        $scope.updateUser = function () {
            UserFactory.update($scope.user,function(){
            	$location.path('/user-list');
            },errorCallback);
        };
        
        $scope.addFormField = function() {
            $scope.user.contactInfos.push({})
        }

        // callback for ng-click 'cancel':
        $scope.cancel = function () {
            $location.path('/user-list');
        };

        $scope.user = UserFactory.show({id: $routeParams.id},function(){
        	if(!$scope.user.contactInfos){
            	$scope.user.contactInfos = [];
            }
        });
    }]);

app.controller('UserCreationCtrl', ['$scope', 'UserFactory', '$location',
    function ($scope, UserFactory, $location) {
	 	$scope.master = {};
        // callback for ng-click 'createNewUser':
        $scope.createNewUser = function (user) {
        	$scope.userCreateForm.submitted = true;
        	if(!$scope.userCreateForm.$valid)
        	{	
        		alert(1);
        	}else{
        	$scope.master = angular.copy($scope.user);
	        UserFactory.create($scope.user);
	            $location.path('/user-list');
        	}
        }
    }]);
