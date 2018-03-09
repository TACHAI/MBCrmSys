/**
 * Created by asus30 on 2018/3/5.
 */
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
