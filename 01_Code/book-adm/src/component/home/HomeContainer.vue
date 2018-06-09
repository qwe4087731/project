<template>
    <div>
        <aside class="aside clearfix">
            <div class="pull-right">
                <nav>
                    <ul class="list-inline">
                        <li>Hi!{{userInfo.name}}</li>
                        <li><span class="glyphicon glyphicon-triangle-right"></span>退出系统</li>
                        <li><span class="glyphicon glyphicon-triangle-right"></span>修改密码</li>
                        <li><span class="glyphicon glyphicon-triangle-right"></span>关于我们</li>
                    </ul>
                </nav>
            </div>
        </aside>

        <header>
            <nav class="col-md-2">
                <dl>
                    <dt>
                        <button class="btn btn-block">爬虫维护<span class="caret pull-right"></span></button>
                    </dt>
                    <dd><a class="btn btn-block">123123123</a></dd>
                    <dd><a class="btn btn-block">123123123</a></dd>
                </dl>
                <dl>
                    <dt>
                        <button class="btn btn-block">小说维护<span class="caret"></span></button>
                    </dt>
                    <dd><a class="btn btn-block">123123123</a></dd>
                </dl>
            </nav>
        </header>
    </div>
</template>

<script>

    export default {
        name: "home-container",
        data() {
            return {
                userInfo: {}
            }
        },
        created() {
            this.getUserInfo();
        },

        methods: {
            getUserInfo() {
                var that = this;
                this.request('user/info.html', 'POST', null, function (data) {
                    that.userInfo = {
                        name: data
                    };
                }, function (errMsg, errCode) {
                    console.log("读取用戶信息失敗");
                });
            }
        }
    }
</script>

<style scoped>
    .btn {
        border-radius: 50px;
    }

    .glyphicon-triangle-right {
        font-size: 14px;
        color: white;
    }
</style>