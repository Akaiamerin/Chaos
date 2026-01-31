export default [
    {
        path: '/',
        name: 'home',
        component: () => {
            return import('@/views/HomeView.vue');
        }
    }
];