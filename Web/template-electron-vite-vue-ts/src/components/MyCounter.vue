<template>
    <div class="my-counter-container">
        <div class="btn-group">
            <button v-on:click="counterStore.decrement" class="btn">-</button>
            <input v-bind:value="counterStore.numRef" type="text" disabled>
            <button v-on:click="counterStore.increment" class="btn">+</button>
        </div>
        <div class="btn-group">
            <button v-on:click="counterStore.decrement" class="btn">-</button>
            <input v-bind:value="counterStore.doubleNumRef" type="text" disabled>
            <button v-on:click="counterStore.increment" class="btn">+</button>
        </div>
        <div class="btn-group">
            <button v-on:click="counterStore.asyncDecrement" class="btn">-</button>
            <input v-bind:value="counterStore.numRef" type="text" disabled>
            <button v-on:click="counterStore.asyncIncrement" class="btn">+</button>
        </div>
    </div>
</template>

<script setup lang="ts">
import useCounterStore from '@/store/modules/counter';
import type { CounterStore } from '@/types/CounterStore';
const counterStore: CounterStore = useCounterStore();
</script>

<style scoped>
.btn-group {
    display: flex;
    margin: 0 0 1rem 0;
}

.btn-group .btn {
    width: 24px;
    height: 24px;
}
</style>