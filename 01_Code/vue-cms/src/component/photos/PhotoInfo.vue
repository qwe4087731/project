<template>
    <div class="photoinfo-container">
        <h3>{{photoinfo.title}} </h3>
        <p class="subtitle">
            <span>发表时间：{{photoinfo.add_time|dateFormat}}</span>
            <span>点击：{{photoinfo.click}}次</span>
        </p>
        <hr/>
        <!--<img class="preview-img" v-for="(item, index) in list" :src="item.src" height="100"-->
        <!--@click="$preview.open(index, list)" :key="item.src">-->
        <vue-preview :slides="list" @close="handleClose"></vue-preview>
        <div class="content" v-html="photoinfo.content"></div>
        <comment-box :id="id"></comment-box>
    </div>
</template>

<script>
    import Comment from '../subcomponent/Comment.vue'

    export default {
        name: "photo-info",
        data: function () {
            return {
                id: this.$route.params.id,
                photoinfo: {},
                list: []
            };
        },
        created: function () {
            this.getPhotoInfo();
            this.getThumbs();
        },
        methods: {
            handleClose: function () {
                console.log('close event')
            },
            getPhotoInfo: function () {
                //获取图片详情
                // this.$http.get('api/getimginfo' + this.id).then(result => {
                //     if (result.body.status === 0) {
                //         this.photoinfo = result.body.message;
                //     }
                // })
                var photoinfo = {
                    add_time: '2015-04-07',
                    click: 12,
                    content: '内容37',
                    id: 37,
                    title: '标题37'
                }
                this.photoinfo = photoinfo;
            },
            getThumbs: function () {
                // this.$http.get("/api/getlthumbs/" + this.id).then(result => {
                //     if (result.body.status == 0) {
                //         result.body.message.forEach(function (item) {
                //             item.w = 600;
                //             item.h = 400;
                //         })
                //     }
                // });
                this.list = this.list.concat([{
                    src: 'http://img4.imgtn.bdimg.com/it/u=4063527091,1765948189&fm=27&gp=0.jpg',
                    msrc: 'http://img4.imgtn.bdimg.com/it/u=4063527091,1765948189&fm=27&gp=0.jpg',
                    w: 600,
                    h: 400
                }, {
                    src: 'http://img4.imgtn.bdimg.com/it/u=163384988,632805464&fm=27&gp=0.jpg',
                    msrc: 'http://img4.imgtn.bdimg.com/it/u=163384988,632805464&fm=27&gp=0.jpg',
                    w: 600,
                    h: 400
                }, {
                    src: 'http://img0.imgtn.bdimg.com/it/u=3577930045,2595980619&fm=27&gp=0.jpg',
                    msrc: 'http://img0.imgtn.bdimg.com/it/u=3577930045,2595980619&fm=27&gp=0.jpg',
                    w: 600,
                    h: 400
                }, {
                    src: 'http://img2.imgtn.bdimg.com/it/u=3412247870,1641633742&fm=11&gp=0.jpg',
                    msrc: 'http://img2.imgtn.bdimg.com/it/u=3412247870,1641633742&fm=11&gp=0.jpg',
                    w: 600,
                    h: 400
                }, {
                    src: 'http://img5.imgtn.bdimg.com/it/u=2155383765,2652738918&fm=27&gp=0.jpg',
                    msrc: 'http://img5.imgtn.bdimg.com/it/u=2155383765,2652738918&fm=27&gp=0.jpg',
                    w: 600,
                    h: 400
                }, {
                    src: 'http://img5.imgtn.bdimg.com/it/u=434955855,1226526860&fm=27&gp=0.jpg',
                    msrc: 'http://img5.imgtn.bdimg.com/it/u=434955855,1226526860&fm=27&gp=0.jpg',
                    w: 600,
                    h: 400
                }]);
            }
        },
        components: {
            'comment-box': Comment
        }

    }
</script>

<style lang="scss" scoped>
    .photoinfo-container {
        padding: 3px;
        h3 {
            color: #26a2ef;
            font-size: 15px;
            text-align: center;
            margin: 15px 0;
        }
        .subtitle {
            display: flex;
            justify-content: space-between;
            font-size: 13px;
        }

        .content {
            font-size: 13px;
            line-height: 30px;
        }
    }
</style>