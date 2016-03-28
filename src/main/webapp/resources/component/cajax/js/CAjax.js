/**
 * Created by longyunxiang on 2015-7-17.
 */
(function($){
        $.CAjax = function() {
            var _self = this;
            var WADGET_NAME = "CAjax";

            this.post = function(url, params, success, error, flag){
            	var jsonData = JSON.stringify(params);
                $.ajax({
                    type:"post",
                    url:url,
                    dataType : 'json',
                    contentType:'application/json;charset=UTF-8',
                    data:jsonData,
                    async:flag,
                    success:function(data){
                        success(data);
                    },
                    error:function(data){
                        error(data);
                    },
                });
            };
            
            this.postString = function(url, params, success, error, flag){
                $.ajax({
                    type:"post",
                    url:url,
                    data:params,
                    async:flag,
                    success:function(data){
                        success(data);
                    },
                    error:function(data){
                        error(data);
                    },
                });
            };

            this.postRetNotJson = function(url, params, success, error, flag){
                var jsonData = JSON.stringify(params);
                $.ajax({
                    type:"post",
                    url:url,
                    contentType:'application/json;charset=UTF-8',
                    data:jsonData,
                    async:flag,
                    success:function(data){
                        success(data);
                    },
                    error:function(data){
                        error(data);
                    },
                });
            }
            
            this.get =function(url, params, success, error, flag){
            	var jsonData = JSON.stringify(params);
                $.ajax({
                    type:"get",
                    url:url,
                    dataType : 'json',
                    contentType:'application/json;charset=UTF-8',
                    data:jsonData,
                    async:flag,
                    success:function(data){
                        success(data);
                    },
                    error:function(data){
                        error(data);
                    },
                });
            }
        }
    }
)(jQuery);
var CAjax = new $.CAjax();