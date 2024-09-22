<template>
    <div class="index-view-container">
        <div class="index-router-link-container">
            <router-link to="/">home</router-link>
            <router-link to="/counter">counter</router-link>
        </div>
        <div class="index-router-view-container">
            <router-view></router-view>
        </div>
    </div>
</template>

<script setup lang="ts">
import { RouterLink, RouterView } from 'vue-router';
</script>

<style scoped>
.index-router-link-container a {
    margin: 0 0.5rem 0 0.5rem;
}
</style>