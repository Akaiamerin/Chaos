import type { RouteComponent } from 'vue-router';
export default [
    {
        path: '/',
        name: 'home',
        component: (): Promise<RouteComponent> => {
            return import('@/views/HomeView.vue');
        }
    }
];