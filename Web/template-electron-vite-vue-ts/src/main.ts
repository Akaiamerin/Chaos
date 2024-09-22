import { createApp } from 'vue';
import App from '@/App.vue';
import pinia from '@/store';
import router from '@/router';
import '@/assets/main.css';
const app = createApp(App);
app
    .use(pinia)
    .use(router)
    .mount('#app');