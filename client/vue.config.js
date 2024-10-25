const target = "http://127.0.0.1:8080"

module.exports = {
  devServer: {
    port: 3000,
    proxy: {
      '^/api':{
        target,
        changeOrigin: true
      }
    }
  }
}