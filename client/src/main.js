import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import mixins from './mixins'

import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css'

createApp(App).use(router).mixins(mixins).mount('#app')
