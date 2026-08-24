import type { RouteComponent } from 'vue-router';
export default [
    {
        path: '/counter',
        name: 'counter',
        component: (): Promise<RouteComponent> => {
            return import('@/views/CounterView.vue');
        }
    }
];