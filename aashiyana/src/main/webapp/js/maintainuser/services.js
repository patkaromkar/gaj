'use strict';

/* Services */

/*
 http://docs.angularjs.org/api/ngResource.$resource

 Default ngResources are defined as

 'get':    {method:'GET'},
 'save':   {method:'POST'},
 'query':  {method:'GET', isArray:true},
 'remove': {method:'DELETE'},
 'delete': {method:'DELETE'}

 */

var services = angular.module('ngdemo.services', ['ngResource']);

services.factory('DummyFactory', function ($resource) {
    return $resource('/ngdemo/web/dummy', {}, {
        query: { method: 'GET', params: {}, isArray: false }
    })
});

services.factory('UsersFactory', function ($resource) {
    return $resource('/aashiyana/maintainUser/getAll', {}, {
        query: { method: 'GET', isArray: true },
    })
});




services.factory('UserFactory', function ($resource) {
    return $resource('', {}, {
    	create: { method: 'POST' ,url: 'maintainUser/createUser'},
        show: { method: 'GET', url: '/aashiyana/maintainUser/:id' },
        update: { method: 'POST', url: 'maintainUser/updateUser', isArray: false},
        deleteUser: { method: 'DELETE', params: {id: '@id'} }
    })
});
