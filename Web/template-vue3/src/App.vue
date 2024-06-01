<template>
    <div class="app-container">
        <div class="link-container">
            <router-link to="/">home</router-link>
            <router-link to="/counter">counter</router-link>
        </div>
        <div class="view-container">
            <router-view></router-view>
        </div>
    </div>
</template>

<script setup>
import { RouterLink, RouterView } from 'vue-router';
</script>

<style scoped>
.link-container a {
    margin: 0 0.5rem 0 0.5rem;
}
</style>