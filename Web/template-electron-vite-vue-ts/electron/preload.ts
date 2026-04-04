window.addEventListener('DOMContentLoaded', (): any => {
    const versionTypeList: string[] = ['node', 'chrome', 'electron'];
    for (let i: number = 0; i < versionTypeList.length; i++) {
        const versionType: string = versionTypeList[i];
        console.log(`${versionType} version: ${process.versions[versionType]}`);
    }
});