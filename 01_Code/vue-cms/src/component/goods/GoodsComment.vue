<template>
    <div>
        <cmtbox :id="$route.params.id"></cmtbox>
    </div>
</template>

<script>
    import cmtbox from '../subcomponent/Comment.vue'

    export default {
        name: "goods-comment",
        components: {
            cmtbox
        }
    }
</script>

<style scoped>

</style>