import type { Ref, ComputedRef } from 'vue';
import type { Store } from 'pinia';
export declare interface CounterSetupStore {
    numRef: Ref<number>;
    doubleNumRef: ComputedRef<number>;
    increment: () => void;
    decrement: () => void;
    asyncIncrement: () => Promise<void>;
    asyncDecrement: () => Promise<void>;
}
export declare type CounterStore = Store<
    'counter',
    Pick<CounterSetupStore, 'numRef'>,
    Pick<CounterSetupStore, 'doubleNumRef'>,
    Pick<CounterSetupStore, 'increment' | 'decrement' | 'asyncIncrement' | 'asyncDecrement'>
>;