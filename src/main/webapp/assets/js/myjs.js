/**
 * Created by asus30 on 2018/3/5.
 */
var flag=true;
var temp=true;
function TimestampToDate(Timestamp) {
    var date = new Date(Timestamp);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
    Y = date.getFullYear() + '-';
    M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
    D = date.getDate() + ' ';
    h = date.getHours() + ':';
    m = date.getMinutes() + ':';
    s = date.getSeconds();
    return Y+M+D+h+m+s;
}
function TimestampToDate1(Timestamp) {
    var date = new Date(Timestamp);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
    Y = date.getFullYear() + '-';
    M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
    D = date.getDate()<10 ? '0'+date.getDate():date.getDate();
    return Y+M+D;

}
//从当前url中获得参数
function getParam() {
    var url=window.location.search;//获取当前url ?后面的值
    var theRequest = new Object();
    if(url.indexOf("?")!=-1){
        var str=url.substr(1);
        if(str.indexOf("&"!=-1)){
            var strs=str.split("&");
            for(var i=0;i<str.length;i++){
                str=strs[i].split("=");
                theRequest[str[0]]=decodeURI(str[1]);
            }
        }else {
            var strs=str.split("=");
            theRequest[strs[0]]=decodeURI(strs[1])
        }

    }
    return theRequest;
}
//从后台获得option的list并渲染到当前的select
function getBackOptions(url,obj) {
    $.ajax({
        type:'get',
        url:url,
        dataType:'json',
        success:function (data) {
            console.info("成功从后台获得opption:"+data.data)
            // obj.innerHTML = "";  清空 opption
            if(data.status==0){
                //通过flag来控制该方法只执行一次
                if(flag==true){
                $.each(data.data, function (i, item) {
                    if (item == null) {
                        return;
                    }
                    $("<option></option>")
                        .val(item["value"])
                        .text(item["text"])
                        .appendTo(obj);
                });
                    flag=false;
                }
            }
        },
        error:function (data) {
            console.info("发生了错误",data);
        }
    })
}
function getBackOptions1(url,obj) {
    $.ajax({
        type:'get',
        url:url,
        dataType:'json',
        success:function (data) {
            console.info("成功从后台获得opption:"+data.data)
            // obj.innerHTML = "";  清空 opption
            if(data.status==0){
                //通过flag来控制该方法只执行一次
                if(temp==true){
                    $.each(data.data, function (i, item) {
                        if (item == null) {
                            return;
                        }
                        $("<option></option>")
                            .val(item["value"])
                            .text(item["text"])
                            .appendTo(obj);
                    });
                    temp=false;
                }
            }
        },
        error:function (data) {
            console.info("发生了错误",data);
        }
    })
}