<template>
    <div class="cmt-container"><h3>发表评论</h3>
        <hr>
        <textarea placeholder="请输入内容(最多120个字)" maxlength="120" v-model="msg"></textarea>
        <mt-button type="primary" size="large" @click="postComment">发表评论</mt-button>
        <div class="cmt-list">
            <transition-group>
                <div class="cmt-item" v-for="item in comments" :key="item.add_time">
                    <div class="cmt-title">{{item.title}}发表时间：{{item.add_time}}</div>
                    <div class="cmt-body">{{item.content}}</div>
                </div>
            </transition-group>
        </div>
        <mt-button type="danger" size="large" plain="" @click.prevent="getCommentList">加载更多</mt-button>
    </div>
</template>

<script>
    import {Toast} from 'mint-ui'

    export default {
        name: "comment",
        data: function () {
            return {
                pageIndex: 1,
                comments: [],
                msg: ''
            };
        },
        props: ['id'],
        created: function () {
            this.getCommentList();
        },
        methods: {
            getCommentList: function () {
                var id = this.id;
                var pageIndex = this.pageIndex++;
                this.comments = this.comments.concat([
                    {
                        add_time: '2012-02-01_' + pageIndex,
                        title: '标题' + pageIndex,
                        content: '内容' + pageIndex
                    },
                    {
                        add_time: '2012-02-02_' + pageIndex,
                        title: '标题' + pageIndex,
                        content: '内容' + pageIndex
                    },
                    {
                        add_time: '2012-02-03_' + pageIndex,
                        title: '标题' + pageIndex,
                        content: '内容' + pageIndex
                    },
                    {
                        add_time: '2012-02-04_' + pageIndex,
                        title: '标题' + pageIndex,
                        content: '内容' + pageIndex
                    },
                    {
                        add_time: '2012-02-05_' + pageIndex,
                        title: '标题' + pageIndex,
                        content: '内容' + pageIndex
                    }
                ]);
            },

            postComment: function () {
                console.log("msg:" + this.msg.trim());
                if (!this.msg.trim()) {
                    return Toast('评论内容不能为空');
                }
                // this.$http.post('/api/postcomment', {
                //     content: this.msg.trim()
                // }).then(function (result) {
                //     if (result.body.status == 0) {
                //         var cmt = {
                //             add_time: Date.now(),
                //             title: '标题',
                //             content: this.msg.trim()
                //         }
                //         this.msg = '';
                //         this.comments = this.comments.unshift(cmt);
                //     }
                //
                // })
                var cmt = {
                    add_time: Date.now(),
                    title: '标题',
                    content: this.msg.trim()
                }
                this.msg = '';
                this.comments.unshift(cmt);
            }
        }
    }
</script>

<style lang="scss" scoped>
    v-enter, .v-leave-to {
        opacity: 0;
        transform: translateX(180px);
    }

    .v-enter-active, .v-leave-active {
        transition: all 0.6s ease;
    }

    .cmt-container {
        h3 {
            font-size: 18px;
        }
        textarea {
            font-size: 14px;
            height: 85px;
            margin: 0;
        }

        .cmt-list {
            margin: 5px 0;

            .cmt-item {
                font-size: 13px;
                .cmt-title {
                    line-height: 30px;
                    background: #ccc;
                }
                .cmt-body {
                    line-height: 35px;
                    text-indent: 2em;
                }
            }

        }
    }
</style>