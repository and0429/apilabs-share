(function (angular, undefined) {
    'use strict';

    var app = angular.module('api', [

    ]);

    app.config(['$httpProvider', function ($httpProvider) {
        $httpProvider.interceptors.push(['$q', function ($q) {
            return {
                'request': function (config) {
                    return config;
                },
                'requestError': function (rejection) {
                    return $q.reject(rejection);
                },
                'response': function (response) {
                    return response;
                },
                'responseError': function (rejection) {
                    return $q.reject(rejection);
                }
            }
        }])
    }]);

    /**
     * 
     */
    app.controller("ApiItemsCtrl", ['$scope', 'HttpService', function ($scope, HttpService) {

        var url = {
            'apis': '/share/apis',
            'count': '/share/apis/count'
        }

        $scope.apis = [];
        $scope.filter = {};

        getDocs();

        $scope.search = function () {
            getDocs()
        }

        $scope.enter = function ($event) {
            if ($event.keyCode === 13) {
                getDocs()
            }
        }

        function getDocs() {
            var titleSearch = $scope.filter.search ? $scope.filter.search : undefined;
            HttpService.get(url.apis, { 'title': titleSearch }).then(function (data) {
                $scope.apis = data;
            })
        }

        /**
         * 
         */
        $scope.counter = function (id) {
            HttpService.put(url.count, { 'id': id })
        }



    }])



})(angular, undefined);