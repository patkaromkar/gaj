'use strict';

// Declare app level module which depends on filters, and services
angular.module('ngdemo', ['ngRoute', 'ngdemo.services', 'ngdemo.controllers']).
    config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/dummy', {templateUrl: 'maintainuser/partials/dummy.html', controller: 'DummyCtrl'});
        $routeProvider.when('/user-list', {templateUrl: 'js/maintainuser/partials/user-list.html', controller: 'UserListCtrl'});
        $routeProvider.when('/updateUser/:id', {templateUrl: 'js/maintainuser/partials/user-detail.html', controller: 'UserDetailCtrl'});
        $routeProvider.when('/user-creation', {templateUrl: 'js/maintainuser/partials/user-creation.html', controller: 'UserCreationCtrl'});
        $routeProvider.otherwise({redirectTo: '/dummy'});
    }]);
