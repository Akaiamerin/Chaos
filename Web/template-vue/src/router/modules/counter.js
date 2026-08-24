export default [
    {
        path: '/counter',
        name: 'counter',
        component: () => {
            return import('@/views/CounterView.vue');
        }
    }
];