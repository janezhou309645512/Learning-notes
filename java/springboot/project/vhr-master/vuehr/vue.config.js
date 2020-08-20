let proxyObj = {};
const CompressionPlugin = require("compression-webpack-plugin");
proxyObj['/ws'] = {
    ws: true,
    target: "ws://localhost:9001"
};
proxyObj['/'] = {
    ws: false,
    target: 'http://localhost:9001',
    changeOrigin: true,
    pathRewrite: {
        '^/': ''
    }
}
module.exports = {
    devServer: {
        host: 'localhost',
        port: 8080,
        proxy: proxyObj
    },
    configureWebpack: config => {
        if (process.env.NODE_ENV === 'production') {
            return {
                plugins: [
                    new CompressionPlugin({
                        test: /\.js$|\.html$|\.css/,
                        threshold: 1024,
                        deleteOriginalAssets: false
                    })
                ]
            }
        }
    }
}