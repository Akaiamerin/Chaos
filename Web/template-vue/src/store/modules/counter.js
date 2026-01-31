import { ref, computed } from 'vue';
import { defineStore } from 'pinia';
export default defineStore('counter', () => {
    const numRef = ref(0);
    const doubleNumRef = computed(() => {
        return 2 * numRef.value;
    });
    function increment() {
        numRef.value++;
    }
    function decrement() {
        numRef.value--;
    }
    async function asyncIncrement() {
        await new Promise((resolve) => {
            setTimeout(resolve, 1000);
        });
        increment();
    }
    async function asyncDecrement() {
        await new Promise((resolve) => {
            setTimeout(resolve, 1000);
        });
        decrement();
    }
    return {
        numRef: numRef,
        doubleNumRef: doubleNumRef,
        increment: increment,
        decrement: decrement,
        asyncIncrement: asyncIncrement,
        asyncDecrement: asyncDecrement
    };
});