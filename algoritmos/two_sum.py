
nums = [2,7,11,15]
# nums = [3, 2, 4]
nums = [3, 3]
target = 6

# index = []


# for i in range(len(nums)):
#     hash[nums[i]] = target - nums[i]

# for i in range(len(nums)):
#     for j in range(i + 1, len(nums)):
#         if hash[nums[i]] == nums[j]:
#             index.append(i)
#             index.append(j)
#             break

def two_sum(nums, target):
    hash = {}
    for i in range(len(nums)):
        complement = target - nums[i]

        if complement not in hash:
            hash[nums[i]] = i
        else:
            return [hash[complement], i]
        
print(two_sum(nums, target))

