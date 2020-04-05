/**
 * @param {number[]} g
 * @param {number[]} s
 * @return {number}
 */
var findContentChildren = function(g, s) {
    let j=0, res=0;
    g.sort((a, b) => a-b);
    s.sort((a, b) => a-b);
    for(let i=0; i<g.length; i++){
        while(j<s.length && g[i]>s[j]) j++;
        if(g[i]<=s[j]){
            res++;
            j++;
        }
    }
    return res;
};