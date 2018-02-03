<%@ page language="java" contentType="text/html;charset=gb2312"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>HomePage--Expected</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/mycss.css" rel="stylesheet">

    <!--Main menu-->
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            var mod_menu=$(".mod-menu");//导航模块区
            var menu=function(){
                var menuItem=$(".menu-item li");//选择导航列表
                menuItem.each(function(){
                    var _index=$(this).index();//获取当前选择菜单列表的索引
                    $(this).mouseenter(function(){
                        var y = $(this).position().top+1;//获取当前鼠标滑过的列表的顶部坐标
                        $(".menu-cont").show();
                        $(".menu-cont").css("top",y);//需要显示的对应索引内容
                        $(this).addClass("mouse-bg").siblings().removeClass("mouse-bg");
                        $(".menu-cont>div").eq(_index).show().siblings().hide();
                    });
                });/*导航菜单菜单*/
                $(".mod-menu").mouseleave(function(){
                    $(".menu-cont").hide();
                    menuItem.removeClass("mouse-bg");
                })
            }//展开二级菜单
            menu();//执行展开二级菜单函
        });
    </script>
    <!--End Main mune-->
</head>
<body>
<div class="container" style="background-color: darkslategray;height: 1000px;margin: 10px auto;padding: 0px 0px;" >
    <div id="head" style="height:15%;width:100%;margin: 0px auto">
        <div id="information" style="background-color: black;color:white;height: 25%;width: 100%">
            <div id="loginstate" style="float: right">
                <table>
                    <tr>
                        <th>客服电话 service phone:${message} &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
                        <th><img src="images/smalluserlogo.png" style="width: 20%;height: 33%;">&nbsp;<a style="color: white">&nbsp;&nbsp;登录&nbsp;login</a></th>
                        <th>&nbsp;&nbsp;&nbsp;</th>
                    </tr>
                </table>
            </div>
        </div>
        <div id="logos" style="height:75%;width:100%;text-align: center">
            <img id="expectedlogo" src="images/Expectedlogo.png" style="width: 15%;height: 100%">
            <img id="expectedimg" src="images/Expected1.jpg"  style="width:65%;height: 100%;">
        </div>
    </div>
    <div id="content" style="height:70%;background-color: #8a6d3b">
        <div class="mod-menu" style="float: left">
            <ul class="menu-item">
                <li><a href="#">主页</a></li>
                <li><a href="#">市场行情</a></li>
                <li><a href="#">自选股</a></li>
                <li><a href="#">股票分析</a></li>
                <li><a href="#">其他市场</a></li>
            </ul><!--一级菜单列表-->

            <div class="menu-cont" style="display:none;top:241px;">

                <div class="menu-cont-list" style="display:none;">
                    <ul>
                        <li>
                            <h3>Welcome-欢迎来到本站</h3>
                            <div class="menu-list-link">
                                <span>亲爱的客户，本网站致力于通过专业的投资模型，为您提供长期的投资指导。您可以在本站上查看A股行情，同时使用本站提供的工具，针对个股和组合进行科学的分析</span>
                            </div>
                        </li>
                    </ul>
                </div>

                <div class="menu-cont-list" style="display:none;">
                        <ul>
                            <li>
                                <h3><a href="#">指数市场</a></h3>
                                <div class="menu-list-link"></div>
                            </li>
                            <li>
                                <h3><a href="#">沪深市场</a></h3>
                                <div class="menu-list-link">
                                    <a href="#">涨幅榜</a>
                                    <span class="long-string">|</span>
                                    <a href="#">跌幅榜</a>
                                </div>
                            </li>
                        <li>
                            <h3><a href="#">板块市场</a></h3>
                            <div class="menu-list-link"></div>
                        </li>
                    </ul>
                </div>

                <div class="menu-cont-list" style="display:none;">
                    <ul>
                        <li>
                            <h3><a href="#">进入我的自选股</a></h3>
                            <div class="menu-list-link"></div>
                        </li>
                    </ul>
                </div>

                <div class="menu-cont-list" style="display:none;">
                    <ul>
                        <li>
                            <h3><a href="#">个股分析</a></h3>
                            <div class="menu-list-link"></div>
                        </li>
                        <li>
                            <h3><a href="#">组合分析</a></h3>
                            <div class="menu-list-link"></div>
                        </li>
                    </ul>
                </div>

                <div class="menu-cont-list" style="display:none;">
                    <ul>
                        <li>
                            <h3><a href="#">美股</a></h3>
                            <div class="menu-list-link"></div>
                        </li>
                        <li>
                            <h3><a href="#">港股</a></h3>
                            <div class="menu-list-link"></div>
                        </li>
                        <li>
                            <h3><a href="#">日经指数</a></h3>
                            <div class="menu-list-link"></div>
                        </li>
                    </ul>
                </div>

            </div>

            <div id="search" style="background-color: #a94442;width: 100%;height: 200px;float: left">
                <form action="stocksearch" method="post">
                        <input name="stockCode" type="text" placeholder="请输入代码/简称" style="width: 66%;margin: 20px auto">
                        <input type="submit"  value="搜索"/>
                </form>
            </div>
        </div>

        <div id="key-index" style="background-color: #5bc0de;width: 75%; height: 500px;float: left;margin: 5px" >
            <div id="sh-index" style="background-color: #4cae4c;width: 100%;height: 200px;">
                <span id="title" style="margin: 0 auto;background-color: #8c8c8c">
                    <h2>上证指数</h2>
                </span>
                <ul style="color: red;float: left;padding: 0 0 20px 10px">
                    <li>点数</li>
                    <li>今日涨跌</li>
                    <li>涨跌幅</li>
                </ul>
                <ul style="color: red;float: left;padding: 0 0 10px 10px">
                    <li>3500.00</li>
                    <li>35</li>
                    <li>1%</li>
                </ul>
            </div>

            <div id="sz-index" style="background-color: #8c8c8c;width: 100%;height: 200px;">
                <span id="" style="margin: 0 auto;background-color: #8c8c8c">
                    <h2>深成指数</h2>
                </span>
                <ul style="color: green;float: left;padding: 0 0 20px 10px">
                    <li>点数</li>
                    <li>今日涨跌</li>
                    <li>涨跌幅</li>
                </ul>
                <ul style="color: green;float: left;padding: 0 0 10px 10px">
                    <li>3500.00</li>
                    <li>35</li>
                    <li>1%</li>
                </ul>
            </div>
        </div>
    </div>
    <div id="foot" style="height:15%">foot</div>
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>