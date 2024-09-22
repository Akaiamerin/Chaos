import { ref, computed } from 'vue';
import type { Ref, ComputedRef } from 'vue';
import { defineStore } from 'pinia';
export default defineStore('counter', (): CounterStore => {
    const numRef: Ref<number> = ref(0);
    const doubleNumRef: ComputedRef<number> = computed((): number => {
        return numRef.value * 2;
    });
    function increment(): void {
        numRef.value++;
    }
    function decrement(): void {
        numRef.value--;
    }
    async function asyncIncrement(): Promise<void> {
        await new Promise((resolve): void => {
            setTimeout(resolve, 1000);
        });
        increment();
    }
    async function asyncDecrement(): Promise<void> {
        await new Promise((resolve): void => {
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