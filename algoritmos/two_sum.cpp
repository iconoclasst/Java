#include <iostream>
#include <vector>
using namespace std;

vector<int> two_sum (vector<int>& nums, int target) {
int n = nums.size();
vector<int> index;

for(int i=0; i <= n; i++) {
    for(int j=i+1; j <= n; j++) {
        if(nums[i] + nums[j] == target) {
            index.push_back(i);
            index.push_back(j);
            break;
        }
    }
}

return index;

}


int main() {

    vector<int> nums {3,3};
    int target = 6;

    vector<int> index = two_sum(nums, target);

    cout << index[0] << " " << index[1] << endl;
}