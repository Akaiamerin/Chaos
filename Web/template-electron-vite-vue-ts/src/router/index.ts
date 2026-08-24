import { createRouter, createWebHashHistory } from 'vue-router';
import home from '@/router/modules/home';
import counter from '@/router/modules/counter';
export default createRouter({
    history: createWebHashHistory(),
    routes: [
        ...home,
        ...counter
    ]
});