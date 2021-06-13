    if(head1 == NULL && head2 == NULL) return NULL;
    else if(head1 == NULL) return head2;
    else if(head2 == NULL) return head1;

    Node *inicio = NULL;
    if(head1->data <= head2->data) inicio = head1;
    else inicio = head2;

    while(head1 != NULL && head2 != NULL) {
        if(head1->data <= head2->data || head2 == NULL) {
            if(head2 == NULL && head1->next != NULL)
                head1 = head1->next;
            else {
                while(head1->next != NULL && head1->next->data <= head2->data) {
                    head1 = head1->next;
                }
                Node *temp1 = head1->next;
                head1->next = head2;
                head1 = temp1;
            }
        }
        else {
            if(head1 == NULL && head2->next != NULL)
                head2 = head2->next;
            else {                
                while(head2->next != NULL && head2->next->data < head1->data) {
                    head2 = head2->next;              
                }
                Node *temp2 = head2->next;
                head2->next = head1;
                head2 = temp2;
            }
        }
    }
    return inicio;