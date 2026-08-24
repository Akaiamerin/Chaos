import { ref, computed } from 'vue';
import type { Ref, ComputedRef } from 'vue';
import { defineStore } from 'pinia';
import type { CounterSetupStore } from '@/types/counter-store';
export default defineStore('counter', (): CounterSetupStore => {
    const numRef: Ref<number> = ref(0);
    const doubleNumRef: ComputedRef<number> = computed((): number => {
        return 2 * numRef.value;
    });
    function increment(): void {
        numRef.value++;
    }
    function decrement(): void {
        numRef.value--;
    }
    async function asyncIncrement(): Promise<void> {
        await new Promise((resolve: TimerHandler): void => {
            setTimeout(resolve, 1000);
        });
        increment();
    }
    async function asyncDecrement(): Promise<void> {
        await new Promise((resolve: TimerHandler): void => {
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