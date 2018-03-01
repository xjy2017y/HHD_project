<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page. <br>
    <img alt="ddd" src="/shopPic/2018/01/04/3mDHnRExV8temp.jpg">
    <form id="fileupload" action="/HHD_Project/shop/upload" method="POST" enctype="multipart/form-data">  
        <!-- Redirect browsers with JavaScript disabled to the origin page -->  
        <noscript><input type="hidden" name="redirect" value="https://blueimp.github.io/jQuery-File-Upload/"></noscript>  
        <!-- The fileupload-buttonbar contains buttons to add/delete files and start/cancel the upload -->  
        <input  name="shopInfo" type="text">
        <div class="row fileupload-buttonbar">  
            <div class="col-lg-7">  
                <!-- The fileinput-button span is used to style the file input field as button -->  
                <span class="btn btn-success fileinput-button">  
                    <i class="glyphicon glyphicon-plus"></i>  
                    <span>选择文件(多选)</span>  
                    <input type="file" name="uploadPic" multiple="multiple">  
                </span>  
                <button type="submit" class="btn btn-primary start">  
                    <i class="glyphicon glyphicon-upload"></i>  
                    <span>开始上传</span>  
                </button>  
                <button type="reset" class="btn btn-warning cancel">  
                    <i class="glyphicon glyphicon-ban-circle"></i>  
                    <span>取消上传</span>  
                </button>  
                <button type="button" class="btn btn-danger delete">  
                    <i class="glyphicon glyphicon-trash"></i>  
                    <span>删除</span>  
                </button>   
                <input type="checkbox" class="toggle" title="全选">  
                <!-- The global file processing state -->  
                <span class="fileupload-process"></span>  
            </div>  
            <!-- The global progress state -->  
            <div class="col-lg-5 fileupload-progress fade">  
                <!-- The global progress bar -->  
                <div class="progress progress-striped active" role="progressbar" aria-valuemin="0" aria-valuemax="100">  
                    <div class="progress-bar progress-bar-success" style="width:0%;"></div>  
                </div>  
                <!-- The extended global progress state -->  
                <div class="progress-extended"> </div>  
            </div>  
        </div>  
        <!-- The table listing the files available for upload/download -->  
        <table role="presentation" class="table table-striped"><tbody class="files"></tbody></table>  
    </form>  
  </body>
</html>
