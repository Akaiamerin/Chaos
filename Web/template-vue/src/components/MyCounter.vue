<template>
    <div class="my-counter-container">
        <div class="my-counter-stepper">
            <div class="title">同步±1</div>
            <div class="my-counter-control-container">
                <button v-on:click="counterStore.decrement" class="button">-</button>
                <input v-bind:value="counterStore.numRef" type="text" disabled>
                <button v-on:click="counterStore.increment" class="button">+</button>
            </div>
        </div>
        <div class="my-counter-stepper">
            <div class="title">同步±2</div>
            <div class="my-counter-control-container">
                <button v-on:click="counterStore.decrement" class="button">-</button>
                <input v-bind:value="counterStore.doubleNumRef" type="text" disabled>
                <button v-on:click="counterStore.increment" class="button">+</button>
            </div>
        </div>
        <div class="my-counter-stepper">
            <div class="title">异步±1</div>
            <div class="my-counter-control-container">
                <button v-on:click="counterStore.asyncDecrement" class="button">-</button>
                <input v-bind:value="counterStore.numRef" type="text" disabled>
                <button v-on:click="counterStore.asyncIncrement" class="button">+</button>
            </div>
        </div>
    </div>
</template>

<script setup>
import useCounterStore from '@/store/modules/counter';
const counterStore = useCounterStore();
</script>

<style scoped>
.my-counter-stepper,
.my-counter-control-container {
    display: flex;
}

.my-counter-control-container .button {
    width: 24px;
    height: 24px;
}
</style>