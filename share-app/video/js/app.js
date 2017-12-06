(function (angular, undefined) {
    'use strict';

    var app = angular.module('video', [

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
    app.controller("VideoItemsCtrl", ['$scope', 'HttpService', '$window', function ($scope, HttpService, $window) {

        var url = {
            'videos': '/share/videos',
            'count': '/share/videos/count'
        }

        $scope.videos = [];
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
            HttpService.get(url.videos, { 'title': titleSearch }).then(function (data) {
                $scope.videos = data;
            })
        }

        /**
         * 
         */
        $scope.extract = function (video) {
            $window.open(video.url, "_blank")// .focus();
            HttpService.put(url.count, { 'id': video.id })
        }



    }])



})(angular, undefined);