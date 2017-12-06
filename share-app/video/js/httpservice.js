(function (angular) {
    'use strict';

    angular
        .module('video')
        .service('HttpService', ['$http', '$q', function ($http, $q) {

            var _confing = {};

            return {

                get: function (url, params) {
                    _confing.params = params;
                    return $http.get(url, _confing).then(function (resp) {
                        return resp.data;
                    })
                },

                put: function (url, data) {
                    return $http.put(url, data).then(function (resp) {
                        return resp.data;
                    })
                }

            }
        }]);
})(angular);