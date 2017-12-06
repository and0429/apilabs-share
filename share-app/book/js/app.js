(function (angular, undefined) {
    'use strict';

    var app = angular.module('Book', []);

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
    app.controller("BookItemsCtrl", ['$scope', 'HttpService', '$window', function ($scope, HttpService, $window) {

        var url = {
            'books': '/share/books',
            'count': '/share/books/count'
        }

        $scope.books = [];
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
            HttpService.get(url.books, {
                'name': titleSearch
            }).then(function (data) {
                $scope.books = data;
            })
        }

        /**
         * 
         */
        $scope.extract = function (book) {
            $window.open(book.url, "_blank") // .focus();
            HttpService.put(url.count, {
                'id': book.id
            })
        }



    }])



})(angular, undefined);