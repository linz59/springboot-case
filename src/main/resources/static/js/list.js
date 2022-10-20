new Vue({
    // # 说明是id选择器
    // . 说明类选择器
    el: "#userList",
    // 表示数据
    data: {
        userList: []    //表示变量 查询所有
    },
    // 定义所有的方法
    methods: {
        findAll: function () {
            var url = "http://localhost:10002/user/findAll";
            //发送异步请求获取所有用户数据
            axios.get(url).then((response) =>{

                this.userList = response.data.data;
            });
        }
    },
    // 钩子函数，生命周期函数
    /**
     * vue 的生命周期函数一共是8个
     *
     * vue的生命周期函数，是两两对应
     * beforeCreated created 创建vue对象的时候，调用的生命周期函数
     * beforeMount 、mounted 从后端获取数据之后，需要把数据展示到前端页面，
     *                      展示页面的时候，调用的生命周期函数
     * beforeUpdate  Update 页面更新数据的时候，调用的生命周期函数
     * beforeDestroy  destoryed 销毁的时候调用的生命周期函数
     *
     * created：用在数据库初始化的时候，进入任何一个页面，如果数据量非常大，
     *          页面就会显示转圈，转圈的动作就是在后台获取数据
     * mounted：如果数据已经获取成功，需要渲染页面的时候，调用当前的函数
     */
    created(){
        this.findAll();
    }
});