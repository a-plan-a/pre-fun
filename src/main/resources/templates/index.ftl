<!DOCTYPE html>
<html>
<head lang="en">
<title>Spring Boot Demo - FreeMarker</title>
<link href="/css/index.css" rel="stylesheet">
<script type="text/javascript" src="/jars/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/js/index.js"></script>
<script src="https://cdn.bootcss.com/vue/2.4.2/vue.min.js"></script>

</head>
<body>
    <h2>首页<h2>
    
    <font> 
        <#-- list userList as item --> 
        <#--   // ${item!}<br /> -->
       <#--list-->
    </font>
    
    <button class="a"> click me</button>
   <div id="app">
  <p>{{ message }}</p>
<input type="text" v-model="message"/>
</div>
</body>
</html>