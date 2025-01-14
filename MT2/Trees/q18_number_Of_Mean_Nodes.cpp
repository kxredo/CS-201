
int number_of_mean_nodes(TreeNode
                             *a)
{
    if (a == nullptr)
    {
        return 0;
    }

    int count = 0;
    if (a->left != nullptr && a->right != nullptr)
    {
        int leftValue = a->left->val;
        int rightValue = a->right->val;

        // Check if the node's value is the mean of its children's values
        if (a->val == (leftValue + rightValue) / 2)
        {
            count = 1; // This is a mean node
        }
    }

    // Recur for left and right subtrees
    count += number_of_mean_nodes(a->left);
    count += number_of_mean_nodes(a->right);

    return count;
}

int numberOfMeanNodes(TreeNode
                          *root)
{
    return number_of_mean_nodes(root);
}
}
