//     通过cookie name获取cookie
	 function getCookie(name){ 
    	var strCookie=document.cookie; 
    	var arrCookie=strCookie.split("; "); 
    	for(var i=0;i<arrCookie.length;i++){ 
    	var arr=arrCookie[i].split("="); 
    	if(arr[0]==name)return  decodeURI(arr[1]); 
    	} 
    	return ""; 
    	} 
//    路径
    var path = "http://localhost:8080/LMS_2.0/";
    
    