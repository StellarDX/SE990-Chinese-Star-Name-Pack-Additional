// Object HD 209288  ---  Double or Multiple Star  ---  OID=@1428764   (@@29770,3)  ---  coobox=9418 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,UV-emission Source 
Star "HD 209288 A"
{
	DateUpdated     "2024-06-12"
	ParentBody      "HD 209288"
	Class           "B5IIIn"
	AbsMagn         -1.6 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.408871868
		Eccentricity    0.485255822
		Inclination     2.26378572
		AscendingNode   0
		ArgOfPericenter 170.015663
		MeanAnomaly     77.4405221
	}
}

Star "HD 209288 B"
{
	ParentBody      "HD 209288"
	Class           "F4.4?"
}