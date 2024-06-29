// Object * 39 Tau  ---  Double or Multiple Star  ---  OID=@690356   (@@20227,3)  ---  coobox=4333 
// Object types: High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "39 Tau A"
{
	DateUpdated     "2024-06-29"
	ParentBody      "39 Tau"
	Class           "G5V"
	AbsMagn         4.77 // 计算的值
	MassSol         1.10
	RadSol          0.96
	LumBol          1.01
	Teff            5903
	FeH             0.14
	RotationPeriod  218.88
	Age             1.0

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.34284231
		Eccentricity    0.373838207
		Inclination     1.23159182
		AscendingNode   0
		ArgOfPericenter 78.0019306
		MeanAnomaly     143.311583
	}
}

Star "39 Tau B"
{
	ParentBody      "39 Tau"
	Class           "K8.6?"
}