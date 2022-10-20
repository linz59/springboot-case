new Vue({
    el: "#loginDiv",
    data: {
        varifyCode:"",  //验证码
        message:"",     //错误信息
        phone: ""       //用户手机号
    },
    methods: {
        sendCode:function(){
            var url = "http://localhost:10002/order/sendCode?phone="+this.phone;
            //发送异步请求 --- 发送验证码
            axios.get(url).then(function (response) {
                if(response.data.status) {
                    alert("验证码发送成功!")
                }
            });
        },
        login:function () {
            var url = "http://localhost:10002/order/login?phone="+this.phone+"&varifyCode="+this.varifyCode;
            var _this = this;
            //发送异步请求 --- 用户登录
            axios.get(url).then(function (response) {
                //登录成功
                if(response.data.status==true){
                    location.href = "list.html";
                    return ;
                }

                //登录失败
                _this.message = response.data.msg ;

            });

        }
    }
});