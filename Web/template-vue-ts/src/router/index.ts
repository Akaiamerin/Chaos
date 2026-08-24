import { createRouter, createWebHistory } from 'vue-router';
import home from '@/router/modules/home';
import counter from '@/router/modules/counter';
export default createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes: [
        ...home,
        ...counter
    ]
});