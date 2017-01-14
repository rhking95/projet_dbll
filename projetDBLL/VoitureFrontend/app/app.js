// JavaScript Document
var app = angular.module("myApp", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "accueil.html" , Controller : 'C1'
    })
    .when("/marques", {
        templateUrl : "marques.html" , Controller : 'C2'
    })
     .otherwise,{
        templateUrl : "#"
    };
});

var MarquesServices = angular.factory('Marques',function($resources){
    return $resources('http://localhost:8085/webresources/marques', {},{
    query : {method: 'GET', isArray:true}
    })
});
    
    var VoituresServices = angular.factory('Voitures',function($resources){
    return $resources('http://localhost:8085/webresources/voitures', {},{
    query : {method: 'GET', isArray:true}
    })
    });
    
    angular.module('myApp',[])
            .controller('C1',function($scope, Marques) {
            $scope.toutesmarques = Marques.query() ;
            $scope.getselectedelement = function(c){
                $scope.selected = c.idm;
            };
            })
            .controller('C2',function($scope, Voitures) {
            $scope.toutesvoitures = Voitures.query() ;
            });