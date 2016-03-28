/**
 * 
 */
(function($){
	$.HomePageMgmt = function(){
		
		this.init = function(){
			
		};
		
		var _registEvent = function(){
			$(".btn.btn-success").click(function(){
				_invalidByNamePasswd();
			});
		};
		
		var _invalidByNamePasswd = function(){
			var url = ROOT_URL + "user/invalidByNamePasswd";
			var name = $("input[type='text']");
			var passwd = $("input[type='password']");
			
			var params={
					name:name,
					passwd:passwd,
			};
			
			CAjax.post(url, params, function(ret){
				
			}, function(ret){
				
			});
		};
	};
	
})(jQuery);