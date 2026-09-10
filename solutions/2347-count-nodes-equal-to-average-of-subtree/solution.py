# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def averageOfSubtree(self, root: TreeNode) -> int:
        matching_node_count = 0

        def post_order(node):
            nonlocal matching_node_count
            if not node:
                return 0, 0  # sum, count

            left_sum, left_count = post_order(node.left)
            right_sum, right_count = post_order(node.right)

            current_sum = node.val + left_sum + right_sum
            current_count = 1 + left_count + right_count

            if node.val == (current_sum // current_count):
                matching_node_count += 1

            return current_sum, current_count

        post_order(root)
        return matching_node_count
        
