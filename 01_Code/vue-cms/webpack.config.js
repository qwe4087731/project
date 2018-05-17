const path = require('path')
const webpack = require('webpack')
const htmlWebpackPulgin = require('html-webpack-plugin')
const {VueLoaderPlugin} = require('vue-loader');

module.exports = {
    entry: path.join(__dirname, './src/main.js'),
    output: {
        path: path.join(__dirname, './dist'),
        filename: 'bundle.js'
    },
    plugins: [
        new webpack.HotModuleReplacementPlugin(),
        new htmlWebpackPulgin({
            template: path.join(__dirname, './src/index.html'),
            filename: 'index.html' //指定生成页面的名称
        }),
        new VueLoaderPlugin()
    ],
    module: {//这个节点用于配置所有的第三方模块加载器
        rules: [
            {
                test: /\.css$/,
                use: ['style-loader', 'css-loader']
            },
            {
                test: /\.less$/,
                use: ['style-loader', 'css-loader', 'less-loader']
            },
            {
                test: /\.scss$/,
                use: ['style-loader', 'css-loader', 'sass-loader']
            },
            {
                test: /\.(jpg|png|gif|bmp|jpeg)$/,
                use: ['url-loader?limit=7000&name=[hash:8]-[name].[ext]']
            },
            {
                test: /\.(ttf|eot|svg|woff|woff2)$/,
                use: ['url-loader']
            },
            {
                test: /\.js$/,
                use: ['babel-loader'],
                exclude: /node_modules/
            },
            {
                test: /\.vue$/,
                use: ['vue-loader'],
            }

        ]
    },
    resolve: {
        alias: {
            // 'vue$': 'vue/dist/vue.js'
        }
    }
}