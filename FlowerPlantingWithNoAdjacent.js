/**
 * @param {number} N
 * @param {number[][]} paths
 * @return {number[]}
 */
var gardenNoAdj = function(N, paths) {
    let network={};
    let res=[];
    for(let i=0; i<N+1; i++) network[i]=[];
    for(let i=0; i<paths.length; i++){
        let path=paths[i];
        network[path[0]].push(path[1]);
        network[path[1]].push(path[0]);
    }
    res[0]=1;
    for(let i=1; i<N; i++){
        let temp=[1,2,3,4];
        for(let j=0; j<network[i+1].length; j++){
            temp.splice(temp.indexOf(res[network[i+1][j]-1]),1);
        }
        res[i]=temp[0];
    }
    return res;
};